SUMMARY = "Enlightenment files for upstream branding"
DESCRIPTION = "Various files for Enlightenment provided by upstream but altered by openSUSE or Petite Linux."
LICENSE = "BSD-2-Clause"

PV = "0.25.4"

RPM_NAME = "enlightenment-branding-upstream-0.25.4-5.11.aarch64.rpm"
RPM_HASH = "fbfb932d6c2f007e534d8cd7ddefac8b809a90cd9404bae224d888c062585fd332ccd5c95e8adf28f6a104feefe774c5e903348efeca0feacd29ad4b0ea7c202"

RPROVIDES:${PN} += "enlightenment-branding \
enlightenment-branding-upstream"

RDEPENDS:${PN} += "enlightenment-theme-upstream"

inherit rpm
