SUMMARY = "Classes implementing the SARIF 2.1.0 object model"
DESCRIPTION = "Classes implementing the SARIF 2.1.0 object model."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python313-sarif-om-1.0.4-3.5.noarch.rpm"
RPM_HASH = "c9a47ecafbbf7410abfa9dbc59c51ca714258f6be45b0b1cea1afc8c2c8dd3b258b019f6e4759508d9a3817a1cc971913d9915177c7d4c40e123de79adf8d2af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sarif-om \
python3.13dist-sarif-om \
python313-sarif-om \
python3dist-sarif-om"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-pbr"

inherit rpm
