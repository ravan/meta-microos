SUMMARY = "Painless YAML configuration"
DESCRIPTION = "Painless YAML configuration."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python314-confuse-2.2.0-1.3.noarch.rpm"
RPM_HASH = "52eddc7602eac9ac7cc138b80aabf2338c91966a1fe42772022d448ee4b01c3ef168c0800204f4f3f702bc30c20d458ffa9e82d79575e1166bac97196dd88d0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-confuse \
python314-confuse \
python3dist-confuse"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML"

inherit rpm
