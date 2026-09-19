SUMMARY = "Fish Completion for cmctl"
DESCRIPTION = "Fish command line completion support for cmctl."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "cmctl-fish-completion-2.5.0-1.4.noarch.rpm"
RPM_HASH = "88971b3cbdf9f9ad91fbb93f02632ac76ec3049f0ed12bf10b322980a79973560eb81d0e42f4dad3ec9862ee0ffb97dc6aa97dc10a09ba34413c824abc4cf9d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmctl-fish-completion"

RDEPENDS:${PN} += "cmctl"

inherit rpm
