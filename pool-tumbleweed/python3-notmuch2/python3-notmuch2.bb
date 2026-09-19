SUMMARY = "Python3 bindings v2 for notmuch"
DESCRIPTION = "Python3 interface (bindings v2) for notmuch"
LICENSE = "GPL-3.0-or-later"

PV = "0.38.3"

RPM_NAME = "python3-notmuch2-0.38.3-5.6.aarch64.rpm"
RPM_HASH = "a3852e28a172227923930d1a7a4d98ace18a8169b5c9240d86ea01538b14187798d35d53a3dcffbd47de0f63da987c6535bff909c6512035f83a0bbff2cde8eb"

RPROVIDES:${PN} += "python3-notmuch2 \
python3.13dist-notmuch2 \
python3dist-notmuch2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnotmuch.so.5 \
python-abi"

inherit rpm
