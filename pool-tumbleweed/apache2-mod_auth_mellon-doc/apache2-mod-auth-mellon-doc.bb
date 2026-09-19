SUMMARY = "Documentation for mod_auth_mellon module"
DESCRIPTION = "This package contains a documentation for mod_auth_mellon module."
LICENSE = "GPL-2.0-or-later"

PV = "0.19.1"

RPM_NAME = "apache2-mod_auth_mellon-doc-0.19.1-1.9.noarch.rpm"
RPM_HASH = "9fc2e615e62f68503cc901e99e75461895b011f04a00321f8276b42e17b557d0abfbb61311250a1e796d58418c9a68defd422a6ebacc7708057a3bcc406721b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache2-mod-auth-mellon-doc"

RDEPENDS:${PN} += "apache2-mod-auth-mellon"

inherit rpm
