SUMMARY = "Fancy dialog replacement for openSUSE"
DESCRIPTION = "openSUSE-focused, Bubble Tea-based compatibility shim for classic dialog \
widgets. It is intended for shell-driven openSUSE tools such as \
opensuse-migration-tool and jeos-firstboot. \
 \
The tool draws its interface on stdout and returns selected values on stderr, \
matching the calling convention expected by many shell scripts that already use \
dialog."
LICENSE = "MIT"

PV = "20260501.3969402"

RPM_NAME = "susedialog-20260501.3969402-1.4.aarch64.rpm"
RPM_HASH = "c47e068a3913574e159c780c6309a8b01bad09129d88fb9a8a679d5955401df06dbe4300746f430e4caf7c7bb10a6fb6465523f7fab44d97b2ae32710549d7ab"

RPROVIDES:${PN} += "config-susedialog \
susedialog"

RDEPENDS:${PN} += ""

inherit rpm
