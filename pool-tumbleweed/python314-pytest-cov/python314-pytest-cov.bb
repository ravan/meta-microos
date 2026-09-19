SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "This plugin produces coverage reports.  It supports centralised testing \
and distributed testing in both load and each modes.  It also supports \
coverage of subprocesses. \
 \
All features offered by the coverage package should be available, either \
through pytest-cov or through coverage's config file."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python314-pytest-cov-7.1.0-1.3.noarch.rpm"
RPM_HASH = "dd84cc766cf1149d37541e69af31e381f38dd2cd063f199b0c4a732542c3bfa73dadc63bcc773752433a991acc3a2a463b7826606646c38ca47486412fb1ba99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-cov \
python314-pytest-cov \
python3dist-pytest-cov"

RDEPENDS:${PN} += "python-abi \
python314-coverage \
python314-pluggy \
python314-pytest"

inherit rpm
