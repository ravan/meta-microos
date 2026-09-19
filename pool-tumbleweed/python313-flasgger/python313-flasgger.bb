SUMMARY = "Tool to extract swagger specs from Flask projects"
DESCRIPTION = "Flasgger is a Flask extension to extract OpenAPI=Specification from all Flask views registered in an API."
LICENSE = "MIT"

PV = "0.9.7.1"

RPM_NAME = "python313-flasgger-0.9.7.1-6.5.noarch.rpm"
RPM_HASH = "adadd274b53bd7b2032e46f386072251ade5afe90a4328412c9db85e4ec4d72cef8b9393b025a642011c34b6de787028e84ebf34380291cc4a3b934aa81735b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flasgger \
python3.13dist-flasgger \
python313-flasgger \
python3dist-flasgger"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-PyYAML \
python313-jsonschema \
python313-mistune \
python313-packaging"

inherit rpm
