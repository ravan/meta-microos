SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.103.0"

RPM_NAME = "python313-aws-sam-translator-1.103.0-1.4.noarch.rpm"
RPM_HASH = "f40cb5bc8eecc84b52298080c4296a6f303f24f863045ddc7a8770d94098412cf572856fe5ce0f5db171519547cb837c53660b3aa5f38f8a41b876b699240dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-sam-translator \
python3.13dist-aws-sam-translator \
python313-aws-sam-translator \
python3dist-aws-sam-translator"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-boto3 \
python313-jsonschema \
python313-pydantic \
python313-typing-extensions \
update-alternatives"

inherit rpm
