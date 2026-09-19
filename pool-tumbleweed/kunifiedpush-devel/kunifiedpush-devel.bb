SUMMARY = "Development files for KUnifiedPush"
DESCRIPTION = "Development files for using KUnifiedPush in your applications."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kunifiedpush-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "24bbb196a3d6642acd1c47b1d47a09aec67e36d7f52a7647590ac116a50c748778f2313ad1be468182fe6ccf13d9d2f2571999e585fa4fd46e90f7e3e269d705"

RPROVIDES:${PN} += "cmake-KUnifiedPush \
kunifiedpush-devel"

RDEPENDS:${PN} += "libKUnifiedPush1"

inherit rpm
