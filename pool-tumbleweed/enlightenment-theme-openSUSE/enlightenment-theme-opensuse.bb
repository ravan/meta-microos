SUMMARY = "openSUSE theme for Enlightenment"
DESCRIPTION = "openSUSE, theme for Enlightenment"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220430.1.26"

RPM_NAME = "enlightenment-theme-openSUSE-20220430.1.26-3.2.noarch.rpm"
RPM_HASH = "88c84b10968ae5a76b867da496cbb003226d3b9f6b64044bb5f792c1cfb09beee25fa46893d826c65700098eefbaa6d6211e4105acea5fdb55ea4e49733d54c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-dft \
enlightenment-theme-openSUSE"

RDEPENDS:${PN} += "elementary"

inherit rpm
