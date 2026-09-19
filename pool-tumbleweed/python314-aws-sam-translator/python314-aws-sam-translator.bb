SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.103.0"

RPM_NAME = "python314-aws-sam-translator-1.103.0-1.4.noarch.rpm"
RPM_HASH = "71fecd69cb9f83cf571a69aa3d7e71d72689a340c4fdb018fe1124945a5ed8c081c897f9f479993c188baaae369b617d855fe1e06e5f87f16b4a6ad9eeef0e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aws-sam-translator \
python314-aws-sam-translator \
python3dist-aws-sam-translator"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-boto3 \
python314-jsonschema \
python314-pydantic \
python314-typing-extensions \
update-alternatives"

inherit rpm
