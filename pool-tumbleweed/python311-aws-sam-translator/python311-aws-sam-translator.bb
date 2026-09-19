SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.71.0"

RPM_NAME = "python311-aws-sam-translator-1.71.0-1.1.noarch.rpm"
RPM_HASH = "f2ba11a89923679cfb9584a12f9f069b2593581e43781ce492be73a57f1ce351aee063a3cf981c6a98db7debcbb43cea56dcf560d4d2d6aa3c83b33ec5e0d2e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-sam-translator \
python3.11dist-aws-sam-translator \
python311-aws-sam-translator \
python3dist-aws-sam-translator"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-boto3 \
python311-jsonschema \
python311-pydantic \
update-alternatives"

inherit rpm
