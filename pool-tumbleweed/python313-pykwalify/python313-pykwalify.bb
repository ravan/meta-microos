SUMMARY = "Python lib/cli for JSON/YAML schema validation"
DESCRIPTION = "YAML/JSON validation library \
This framework is a port with a lot added functionality of the java version of the framework kwalify that can be found at: http://www.kuwata-lab.com/kwalify/ \
The original source code can be found at: http://sourceforge.net/projects/kwalify/files/kwalify-java/0.5.1/ \
The source code of the latest release that has been used can be found at: https://github.com/sunaku/kwalify. Please note that source code is not the original authors code but a fork/upload of the last release available in ruby. \
The schema this library is base and extended from: http://www.kuwata-lab.com/kwalify/ruby/users-guide.01.html#schema"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python313-pykwalify-1.8.0-3.5.noarch.rpm"
RPM_HASH = "db8ec72b45f67dd583408ee25f6fbd440b92345bebb21cadfaa7dece39f8632bccf2abb76811cd7db375272b0ebcf40698cc4dfd3bc9bdb7475922f5c7d0756a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pykwalify \
python3.13dist-pykwalify \
python313-pykwalify \
python3dist-pykwalify"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-docopt \
python313-python-dateutil \
python313-ruamel.yaml"

inherit rpm
