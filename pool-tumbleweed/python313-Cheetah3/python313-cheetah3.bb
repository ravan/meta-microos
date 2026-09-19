SUMMARY = "Template engine and code generation tool"
DESCRIPTION = "Cheetah is an open source template engine and code generation tool. \
 \
It can be used standalone or combined with other tools and frameworks. \
Web development is its principle use, but Cheetah is flexible and can \
also be used to generate C++ game code, Java, SQL, form emails and even \
Python code. \
 \
It is a fork of the original CheetahTemplate library."
LICENSE = "MIT"

PV = "3.4.0.post5"

RPM_NAME = "python313-Cheetah3-3.4.0.post5-2.2.aarch64.rpm"
RPM_HASH = "53dfd7f04b9108a9409e7eed1c8c3fedd830ae299a9e1bbc58a38989b5eb569d0a59ba648b3080255708e6273544ec446c314723db05ffefbfeb9f0165e99b48"

RPROVIDES:${PN} += "python3-Cheetah \
python3-Cheetah3 \
python3-cheetah \
python3.13dist-ct3 \
python313-Cheetah \
python313-Cheetah3 \
python313-cheetah \
python3dist-ct3"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
