SUMMARY = "A RADIUS client library"
DESCRIPTION = "The radcli library is a library for writing RADIUS Clients. The library's \
approach is to allow writing RADIUS-aware application in less than 50 lines \
of C code. It was based originally on freeradius-client and is source compatible \
with it."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.5.3"

RPM_NAME = "radcli-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "47750ed30346ddde5520fcd245de42092266ebde9af2c0c302dc498808c10a8700fd636cf31beeac0adec385fa1d30062fd77575765c789346ef24b946cd08ff"

RPROVIDES:${PN} += "config-radcli \
radcli"

RDEPENDS:${PN} += ""

inherit rpm
