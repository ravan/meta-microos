SUMMARY = "Iosevka in monospace, Monaco style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS07 typeface (monospace, Monaco style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss07-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "88bef7103b4694e4995187fcc6bcf4a1a12ff6aa29bf373a9ff86c54e18a9e89edf03d1731436594020f5b4f399831cececb41f4c2a2f1163dbf9bd1e20be4b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss07-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
