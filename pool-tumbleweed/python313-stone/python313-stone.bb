SUMMARY = "Stone is an interface description language (IDL) for APIs"
DESCRIPTION = "Stone is an interface description language (IDL) for APIs."
LICENSE = "MIT"

PV = "3.3.9"

RPM_NAME = "python313-stone-3.3.9-3.3.noarch.rpm"
RPM_HASH = "15d1e9accdc52060a53365f9ad02b570cdefe88f07fbc921c05c5417db1ec9bccb550ba2a743e73c2a2e70849ab875103933cafba8bee995ca45dcdd36bcf590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stone \
python3.13dist-stone \
python313-stone \
python3dist-stone"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Jinja2 \
python313-packaging \
python313-ply"

inherit rpm
