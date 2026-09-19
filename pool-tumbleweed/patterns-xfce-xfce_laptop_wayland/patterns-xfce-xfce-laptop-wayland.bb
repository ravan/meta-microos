SUMMARY = "XFCE Laptop (Experimental Wayland Variant)"
DESCRIPTION = "XFCE Laptop configuration optimized for Wayland, including power management, \
notifications, and input configuration suitable for portable devices."
LICENSE = "MIT"

PV = "20230212"

RPM_NAME = "patterns-xfce-xfce_laptop_wayland-20230212-12.3.aarch64.rpm"
RPM_HASH = "2bee812dccbd9aeeb32f5d9d5728a47062151091d681cb18fb907457cbc65d93f44c3512850717ac92fa6b74c77fd800bec8ddc6f19fd56d8ac8397967c49932"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-openSUSE-xfce-laptop-wayland \
patterns-xfce-xfce-laptop-wayland"

RDEPENDS:${PN} += "pattern-"

inherit rpm
