SUMMARY = "Utility for running regular jobs"
DESCRIPTION = "Anacron becames part of cronie. Anacron is used only for running regular jobs. \
The default settings execute regular jobs by anacron, however this could be \
overloaded in settings."
LICENSE = "BSD-3-Clause & GPL-2.0-only & MIT"

PV = "1.7.2"

RPM_NAME = "cronie-anacron-1.7.2-100.3.aarch64.rpm"
RPM_HASH = "957e1d073a17521b7de6dda1a3e48e7939461e3cfc237c2d5367c5b0fa27cbfdd704796bca40dc5709411a1306f1164ca7b81000af1d85bf369e29c4a5e85866"

RPROVIDES:${PN} += "config-cronie-anacron \
cronie-anacron"

RDEPENDS:${PN} += "/usr/bin/sh \
cronie \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
