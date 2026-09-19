SUMMARY = "Python lib/cli for JSON/YAML schema validation"
DESCRIPTION = "YAML/JSON validation library \
This framework is a port with a lot added functionality of the java version of the framework kwalify that can be found at: http://www.kuwata-lab.com/kwalify/ \
The original source code can be found at: http://sourceforge.net/projects/kwalify/files/kwalify-java/0.5.1/ \
The source code of the latest release that has been used can be found at: https://github.com/sunaku/kwalify. Please note that source code is not the original authors code but a fork/upload of the last release available in ruby. \
The schema this library is base and extended from: http://www.kuwata-lab.com/kwalify/ruby/users-guide.01.html#schema"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python314-pykwalify-1.8.0-3.5.noarch.rpm"
RPM_HASH = "21f197231dcce50af4650d6f02f5fb1ac694febe9b7b9b3bf7d9d5b4ba4d29bcb8e87f7fd1b82453ea41f273c59e6cc6eb3718b355e371cd0e67005b20e3ae0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pykwalify \
python314-pykwalify \
python3dist-pykwalify"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-docopt \
python314-python-dateutil \
python314-ruamel.yaml"

inherit rpm
