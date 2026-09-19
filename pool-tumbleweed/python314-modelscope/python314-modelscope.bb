SUMMARY = "ModelScope hub and library core (Model-as-a-Service SDK)"
DESCRIPTION = "ModelScope is a Model-as-a-Service SDK for browsing, downloading and \
running models from ModelScope Hub. This package ships the hub/library \
core only: the cv, nlp, audio and related extras are not required. \
The modelscope and ms commands are provided by python-modelscope-hub; \
this package contributes CLI plugins through the \
modelscope_hub.cli_plugins entry-point group."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "1.40.0"

RPM_NAME = "python314-modelscope-1.40.0-1.1.noarch.rpm"
RPM_HASH = "4a2d31c2330dee7b65e41435f49cbfb8e2ecba99d80001b14cd22eb4698a15b2add22671213aa4e94ac97504a0684eee958795965e57e125d80b0b48437e9f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-modelscope \
python314-modelscope \
python3dist-modelscope"

RDEPENDS:${PN} += "python-abi \
python314-filelock \
python314-modelscope-hub \
python314-packaging \
python314-requests \
python314-setuptools \
python314-tqdm \
python314-urllib3"

inherit rpm
