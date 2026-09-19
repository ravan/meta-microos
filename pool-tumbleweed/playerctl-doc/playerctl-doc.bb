SUMMARY = "Documentation for libplayerctl"
DESCRIPTION = "This package provides HTML documentation for libplayerctl."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-doc-2.4.1-1.21.noarch.rpm"
RPM_HASH = "d41d6231f0302e0cfa26388501526ddf6bce3e39424d43bfaddf771466ae93059ce61642d4e13b92adb0198a929a26f2195dbdde3d32add724f2558348a0812e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "playerctl-doc"

RDEPENDS:${PN} += ""

inherit rpm
