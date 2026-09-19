SUMMARY = "Generate sitemap xml files for rpm2docserv"
DESCRIPTION = "This tool generates sitemap xml files from a rpm2docserv generated docserv directory for search engines."
LICENSE = "Apache-2.0"

PV = "20260707.78c4c29"

RPM_NAME = "docserv-sitemap-20260707.78c4c29-1.2.aarch64.rpm"
RPM_HASH = "07cf33d530a9b51c259e2a1c9ec58110afc915a8e14dd83e3d33698a16f09aa433a11e155119b9475f39f994c645b37eae3252ca21c3e45f8f6e756805c8e62c"

RPROVIDES:${PN} += "docserv-sitemap"

RDEPENDS:${PN} += ""

inherit rpm
