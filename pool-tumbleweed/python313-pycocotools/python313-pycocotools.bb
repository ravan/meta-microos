SUMMARY = "Python cocoapi"
DESCRIPTION = "COCO is a large image dataset designed for object detection, segmentation, \
person keypoints detection, stuff segmentation, and caption generation. \
This package provides Matlab, Python, and Lua APIs that assists in loading, \
parsing, and visualizing the annotations in COCO."
LICENSE = "BSD-2-Clause"

PV = "2.0~post.1582219528.8c9bcc3"

RPM_NAME = "python313-pycocotools-2.0~post.1582219528.8c9bcc3-3.3.aarch64.rpm"
RPM_HASH = "3030aad0213745775767f64fb001de9fe60f879a31b078fa6eb64800b0c3ab99f18236059074b70a3a85b2932bd65069a30e444d3109c97997cdf8f9a50f7d48"

RPROVIDES:${PN} += "python3-cocotools \
python3-pycocotools \
python3.13dist-pycocotools \
python313-cocotools \
python313-pycocotools \
python3dist-pycocotools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-Cython \
python313-matplotlib \
python313-setuptools"

inherit rpm
