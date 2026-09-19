SUMMARY = "Tests for the Update Stack"
DESCRIPTION = "Packages used for testing that the update stack works.  These tiny packages do not have any functionality themselves."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-update_test-20241218-34.1.aarch64.rpm"
RPM_HASH = "80587ccf49d8bc0e2eda96dc5ff7aa025f28da477e4d268b20fad57101a586ddeb4ab8366a12e91bdb002176be57763c4b64477ea047190f492af46829166e9d"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-update-test \
patterns-openSUSE-update-test"

RDEPENDS:${PN} += "update-test-affects-package-manager \
update-test-interactive \
update-test-optional \
update-test-reboot-needed \
update-test-security \
update-test-trivial"

inherit rpm
