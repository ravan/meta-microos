SUMMARY = "UAX #14 Unicode Line Breaking Algorithm"
DESCRIPTION = "Unicode::LineBreak performs Line Breaking Algorithm described in Unicode \
Standard Annex #14 [UAX #14]. East_Asian_Width informative property defined \
by Annex #11 [UAX #11] will be concerned to determine breaking positions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2019.001"

RPM_NAME = "perl-Unicode-LineBreak-2019.001-1.44.aarch64.rpm"
RPM_HASH = "4d290ae0f3d8751e698e8c996f65e0230bf2e4745bfe4dba29f04256dd79d1cf0ea0a68170ab167308734aa38be85b9751df196ba0c3d9fa07bc723dffbfd1d2"

RPROVIDES:${PN} += "perl-Text--LineFold \
perl-Unicode--GCString \
perl-Unicode--LineBreak \
perl-Unicode-LineBreak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-MIME--Charset"

inherit rpm
