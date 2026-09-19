SUMMARY = "@public decorator for populating __all__"
DESCRIPTION = "public -- @public for populating __all__."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "python313-atpublic-7.0.0-1.5.noarch.rpm"
RPM_HASH = "1f8aa54547886a2ec170d6975455b007139a2e8ffceecdb6038987223177928c7265d5a3ee2eb24ab76970369ec10e0f345917e217c7fb1ce3c296062b1446c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-atpublic \
python3.13dist-atpublic \
python313-atpublic \
python3dist-atpublic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
