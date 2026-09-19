SUMMARY = "Headers to create LMMS plugins"
DESCRIPTION = "Headers that provide access to the LMMS features. Install it if you plan to \
create a LMMS plugin."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0~git2024.09.21"

RPM_NAME = "lmms-devel-1.3.0~git2024.09.21-2.9.aarch64.rpm"
RPM_HASH = "54a1e80b6d1517ee421b0e599d8433026b6af441224e90ed7d3cc20622f2203fa08468a97c2ecdd69615060f4f78b1c80ecbea692abc13fffd329f4164e685d1"

RPROVIDES:${PN} += "lmms-devel"

RDEPENDS:${PN} += ""

inherit rpm
