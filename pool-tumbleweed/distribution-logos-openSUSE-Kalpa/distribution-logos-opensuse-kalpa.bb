SUMMARY = "Logos for openSUSE Kalpa"
DESCRIPTION = "Logos for openSUSE Kalpa"
LICENSE = "CC-BY-SA-4.0"

PV = "20250203"

RPM_NAME = "distribution-logos-openSUSE-Kalpa-20250203-2.2.noarch.rpm"
RPM_HASH = "f7836114914542f9b2c8ef2b34826df0c193d247744533d175c4c9c73547ef5692d554db222aa350a977ee97c87260ec9db61c9708c63e3c033ebe9a8bd0bb15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos \
distribution-logos-openSUSE-Kalpa"

RDEPENDS:${PN} += ""

inherit rpm
