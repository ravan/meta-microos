SUMMARY = "A set of Python libraries that assist in calling the SoftLayer API"
DESCRIPTION = "This library provides a simple Python client to interact with SoftLayer's XML-RPC API."
LICENSE = "MIT"

PV = "6.2.9"

RPM_NAME = "python313-softlayer-6.2.9-1.2.noarch.rpm"
RPM_HASH = "7614cf03d53ac032b683f47f29a0771a6f32332b7404b229e3ae15547c234cf6b9ab5b0c6b4a7a827fc4a81e6ff27d23773abe83776776276338bcb97d54e29e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-softlayer \
python3.13dist-softlayer \
python313-softlayer \
python3dist-softlayer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-prompt-toolkit \
python313-pygments \
python313-requests \
python313-rich \
python313-urllib3 \
update-alternatives"

inherit rpm
