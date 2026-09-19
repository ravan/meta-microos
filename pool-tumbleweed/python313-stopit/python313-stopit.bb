SUMMARY = "Timeout control decorator and context managers"
DESCRIPTION = "python313-stopit is a python module that provides: \
* a function that raises an exception in another thread, including the main thread. \
* two context managers that may stop its inner block activity on timeout. \
* two decorators that may stop its decorated callables on timeout."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python313-stopit-1.1.2-1.7.noarch.rpm"
RPM_HASH = "4f718880358174caa47522689009aa7c027362277061c6a49a166e6d491e295222b641369918beb882a91df8ca93b77e507b84fdc6a26bf1a2f18ab643eeeda0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stopit \
python3.13dist-stopit \
python313-stopit \
python3dist-stopit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
