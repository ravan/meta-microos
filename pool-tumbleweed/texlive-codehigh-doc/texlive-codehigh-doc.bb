SUMMARY = "Documentation for texlive-codehigh"
DESCRIPTION = "This package includes the documentation for texlive-codehigh"
LICENSE = "LPPL-1.0"

PV = "2026.226.2025csvn77682"

RPM_NAME = "texlive-codehigh-doc-2026.226.2025csvn77682-60.2.noarch.rpm"
RPM_HASH = "07bb51f8d93e2797ba01b12ec9cd171992e752e900a195ea1a35c4164958a89bfa01853b336f74757926dca4605b62126399e89c53bfd5b90b4552378943841e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codehigh-doc"

RDEPENDS:${PN} += ""

inherit rpm
