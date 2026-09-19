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

PV = "3.3.2"

RPM_NAME = "bird3-3.3.2-1.1.aarch64.rpm"
RPM_HASH = "6ccd1dffb6e9d79cc3e33b6cc5274e286f1bcf75a6494d847fed5ab408f6aa6b4e2d7d87f3e2c9c48f639a825ae7002758236e97066234bac8a54ff417007721"

RPROVIDES:${PN} += "bird \
bird-common \
bird3 \
bird6 \
bird6-/usr/sbin/bird6 \
config-bird3 \
group-bird \
user-bird"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libtinfo.so.6 \
shadow"

inherit rpm
