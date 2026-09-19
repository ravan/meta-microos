SUMMARY = "Documentation for texlive-asana-math"
DESCRIPTION = "This package includes the documentation for texlive-asana-math"
LICENSE = "OFL-1.1"

PV = "2026.226.0.000.962svn76895"

RPM_NAME = "texlive-asana-math-doc-2026.226.0.000.962svn76895-60.2.noarch.rpm"
RPM_HASH = "1e5d75e4080a7caea1ef717d667f236f6d1a8da39ecf7bbce93182c4dcd13fe853fe6a58cc220ac41df6fd55684e68847709132a137145e8a23e994f14cedc92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asana-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
