SUMMARY = "Tail Multiple Files"
DESCRIPTION = "MultiTail lets you view one or multiple files like the original \
tail program. \
 \
The difference is that it creates multiple windows on your console \
(with ncurses). Merging of 2 or even more logfiles is possible. \
 \
It can also use colors while displaying the logfiles (through \
regular expressions), for faster recognition of what is important \
and what not. It can also filter lines (again with regular \
expressions). It has interactive menus for editing given regular \
expressions and deleting and adding windows. One can also have \
windows with the output of shell scripts and other software. When \
viewing the output of external software, MultiTail can mimic the \
functionality of tools like 'watch' and such."
LICENSE = "GPL-2.0+"

PV = "6.5.0"

RPM_NAME = "multitail-6.5.0-2.9.aarch64.rpm"
RPM_HASH = "0c2327ad90806793e59fe71bada34221633ef36c2110724cdf57335591cf687e7408c3033961be5484deca7117cf5c5ace0a5f85060a8642cb8083a1f0aceb2f"

RPROVIDES:${PN} += "config-multitail \
multitail"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6"

inherit rpm
