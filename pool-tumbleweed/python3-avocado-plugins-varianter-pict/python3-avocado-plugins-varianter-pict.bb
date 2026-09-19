SUMMARY = "Varianter with combinatorial capabilities by PICT"
DESCRIPTION = "This plugin uses a third-party tool to provide variants created by \
Pair-Wise algorithms, also known as Combinatorial Independent Testing."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-plugins-varianter-pict-113.0-1.2.noarch.rpm"
RPM_HASH = "a66736e9189323c60aae33c459655aa2cc59de4be9ff0571964b9ca35262f9b58246334f520cf584f67f9daff1ee69265fbfa9e04a70eb4a8df182692be5a69d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-varianter-pict \
python3.13dist-avocado-framework-plugin-varianter-pict \
python3dist-avocado-framework-plugin-varianter-pict"

RDEPENDS:${PN} += "python-abi \
python3-avocado"

inherit rpm
