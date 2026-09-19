SUMMARY = "Maxima compiled with SBCL"
DESCRIPTION = "Maxima compiled with SBCL."
LICENSE = "GPL-2.0-or-later"

PV = "5.50.0"

RPM_NAME = "maxima-exec-sbcl-5.50.0-2.2.aarch64.rpm"
RPM_HASH = "f7a7edfc4d4265d9ef6ece1f4cd883f8821994b991475939752d95cdd735a230b08c25bc78668e1c84caf9099bb68a517c374354b2b561dd8f3c8172826cbb98"

RPROVIDES:${PN} += "maxima-exec \
maxima-exec-sbcl"

RDEPENDS:${PN} += "sbcl"

inherit rpm
