SUMMARY = "Firmware files for Adaptec SAS Cards (AIC94xx Series)"
DESCRIPTION = "Firmware files for the Adaptec AIC94xx (Razor) Series of SAS HBA \
Adapters."
LICENSE = "SUSE-Firmware"

PV = "1.35"

RPM_NAME = "adaptec-firmware-1.35-27.3.noarch.rpm"
RPM_HASH = "9dcfa294a071d817175cc934edaf8bd55adb4cfddc2d0b65cd50f9ccf34d8f3900e8484dba17ce757532a0decfc8e215ac81591a174bcef972f9f5e9d001dc66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adaptec-firmware \
firmware-aic94xx-seq.fw"

RDEPENDS:${PN} += ""

inherit rpm
