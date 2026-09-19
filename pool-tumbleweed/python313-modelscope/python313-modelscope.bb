SUMMARY = "ModelScope hub and library core (Model-as-a-Service SDK)"
DESCRIPTION = "ModelScope is a Model-as-a-Service SDK for browsing, downloading and \
running models from ModelScope Hub. This package ships the hub/library \
core only: the cv, nlp, audio and related extras are not required. \
The modelscope and ms commands are provided by python-modelscope-hub; \
this package contributes CLI plugins through the \
modelscope_hub.cli_plugins entry-point group."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "1.40.0"

RPM_NAME = "python313-modelscope-1.40.0-1.1.noarch.rpm"
RPM_HASH = "a56e5858c5b27f76005899f6301bfacff1b6507b5911653638a7cd1ae2a2759de0907d90856779e89ea0eeb1ca5677037150d6ed9c99a7b815f5ee93ea15c213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-modelscope \
python3.13dist-modelscope \
python313-modelscope \
python3dist-modelscope"

RDEPENDS:${PN} += "python-abi \
python313-filelock \
python313-modelscope-hub \
python313-packaging \
python313-requests \
python313-setuptools \
python313-tqdm \
python313-urllib3"

inherit rpm
