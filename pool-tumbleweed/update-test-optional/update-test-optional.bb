SUMMARY = "Test update that is not mandatory"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should have its category set to \
'optional'. The software stack should not select such updates \
for installation by default. This is used, for example, to add \
new packages to a product."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "update-test-optional-5.2-1.15.aarch64.rpm"
RPM_HASH = "3776620c1aebe3f8243ae701ab9aa0172c42edbb2f5128cb1856ff12538adb15df50dee73b79fcf46c4733ad143946d0e22a679920b45e42982aff8e21e488d7"

RPROVIDES:${PN} += "update-test-optional"

RDEPENDS:${PN} += ""

inherit rpm
