SUMMARY = "Icons with distribution logos"
DESCRIPTION = "Icons with openSUSE distribution logos."
LICENSE = "CC-BY-SA-4.0"

PV = "20250203"

RPM_NAME = "distribution-logos-openSUSE-icons-20250203-2.2.noarch.rpm"
RPM_HASH = "b61e78d518d6822a5823224d84c604bdf3f46a5b281039b6f188a8dbfe26bc76098ad1c2b1dfcb54b231bcc69f62de7a1d149fe314e86f77354e2e0382bb2491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos-openSUSE-icons \
systemd-icon-branding \
systemd-icon-branding-openSUSE"

RDEPENDS:${PN} += "distribution-logos"

inherit rpm
