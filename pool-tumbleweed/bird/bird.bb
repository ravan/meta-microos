SUMMARY = "The BIRD Internet Routing Daemon"
DESCRIPTION = "The BIRD project aims to develop a fully functional dynamic IP routing daemon \
primarily targeted on (but not limited to) Linux, FreeBSD and other UNIX-like \
systems and distributed under the GNU General Public License. \
 \
Supports the following: \
 \
* Both IPv4 and IPv6 \
* Multiple routing tables \
* BGP \
* RIP \
* OSPF \
* BFD \
* Babel \
* Static routes \
* IPv6 Router Advertisements \
* Inter-table protocol \
* Command-line interface (using the `birdc' client; to get some help, just press `?') \
* Powerful language for route filtering"
LICENSE = "GPL-2.0-or-later"

PV = "2.19.2"

RPM_NAME = "bird-2.19.2-1.1.aarch64.rpm"
RPM_HASH = "0e413fc7bbca2e9fc3ea7a82e85bf589805d91e5fd9cac66ed20142dd594f3a436823bf94c24bc66604602244c74dcb2fe28067520fe0045fd1ea09bd201beda"

RPROVIDES:${PN} += "bird \
bird-common \
bird6 \
bird6-/usr/sbin/bird6 \
config-bird \
group-bird \
user-bird"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libtinfo.so.6 \
shadow"

inherit rpm
