SUMMARY = "Command-line todo list manager"
DESCRIPTION = "It maintains a list of tasks that you want to do, allowing you to add/remove, \
and otherwise manipulate them. Task has a rich list of subcommands that allow \
you to do sophisticated things with it. You'll find it has customizable \
reports, charts, GTD features, Lua extensions, device synching and more. \
 \
Taskwarrior is a very active project involving people around the globe - check \
often for updates."
LICENSE = "MIT"

PV = "3.4.2"

RPM_NAME = "taskwarrior-3.4.2-1.7.aarch64.rpm"
RPM_HASH = "e075ecb404967f4070d162bd0d7b46b3205c87ef81f3a6a8a016896beb944c1a01f69643c2ccd0fc90bec706d17a1dcfc4e99b8dc633ce71b9f1abb013bb6563"

RPROVIDES:${PN} += "task \
taskwarrior"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
