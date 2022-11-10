import Vue from "vue";
import VueRouter from "vue-router";
import AppMain from "@/views/AppMain.vue";
import AppUser from "@/views/AppUser.vue";


Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "main",
    component: {
      AppMain,
    }
  },
  {
    path: "/user",
    name: "user",
    component: {
      AppUser,
    }
  },
  {
    path: "/board",
    name: "board",
    component: () => import("@/views/AppBoard.vue"),
    redirect: "/board/list",
    children: [
      {
        path: "list",
        name: "boardlist",
        component: () => import("@/components/board/BoardList.vue"),
      },
      {
        path: "write",
        name: "boardwrite",
        component: () => import("@/components/board/BoardWrite.vue"),
      },
      {
        path: "view/:articleno",
        name: "boardview",
        component: () => import("@/components/board/BoardView.vue"),
      },
      {
        path: "modify/:articleno",
        name: "boardmodify",
        component: () => import("@/components/board/BoardModify.vue"),
      },
      {
        path: "delete/:articleno",
        name: "boarddelete",
        component: () => import("@/components/board/BoardDelete.vue"),
      },
    ],
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
