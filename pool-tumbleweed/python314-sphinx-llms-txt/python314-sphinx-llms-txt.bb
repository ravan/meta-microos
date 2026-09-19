SUMMARY = "Sphinx generator for lms-full.txt"
DESCRIPTION = "A Sphinx extension that generates a summary llms.txt file and a single \
combined documentation llms-full.txt file."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python314-sphinx-llms-txt-0.7.1-1.2.noarch.rpm"
RPM_HASH = "3315b1cf2f7a07754407f58c630be031760955bdbfd7e5f8575b12bb0571cf09a0dabdfe5c82c72a309980e4157b502a8011f7f35e0d2aaca32c44a4be0e122b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-llms-txt \
python314-sphinx-llms-txt \
python3dist-sphinx-llms-txt"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
