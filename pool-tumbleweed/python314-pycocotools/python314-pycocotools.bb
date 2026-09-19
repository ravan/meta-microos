SUMMARY = "Python cocoapi"
DESCRIPTION = "COCO is a large image dataset designed for object detection, segmentation, \
person keypoints detection, stuff segmentation, and caption generation. \
This package provides Matlab, Python, and Lua APIs that assists in loading, \
parsing, and visualizing the annotations in COCO."
LICENSE = "BSD-2-Clause"

PV = "2.0~post.1582219528.8c9bcc3"

RPM_NAME = "python314-pycocotools-2.0~post.1582219528.8c9bcc3-3.3.aarch64.rpm"
RPM_HASH = "f400bd346038c09942a99cef9bf94e714686f6f7db8239bcc821725d4f1a895629bc52a0444da18d9fb3378b4367f9d5822b435b959f4a44bc362b11391d5a1f"

RPROVIDES:${PN} += "python3.14dist-pycocotools \
python314-cocotools \
python314-pycocotools \
python3dist-pycocotools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-Cython \
python314-matplotlib \
python314-setuptools"

inherit rpm
