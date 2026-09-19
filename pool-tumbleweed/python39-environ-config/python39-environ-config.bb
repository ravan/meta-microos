SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "22.1.0"

RPM_NAME = "python39-environ-config-22.1.0-1.1.noarch.rpm"
RPM_HASH = "8b660aa5fb63b550e03b8481d1eb76b3cc1c1d8af6dd098cd00edeba0b25191864a33c63aacddb3838ddc4a764894a43d3fcb070caac2e997b5ed8881e0aaf5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-environ-config \
python39-environ-config \
python3dist-environ-config"

RDEPENDS:${PN} += "python-abi \
python39-attrs"

inherit rpm
