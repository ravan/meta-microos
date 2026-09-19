SUMMARY = "Online hand recognition system with machine learning"
DESCRIPTION = "Zinnia is a simple, customizable and portable online hand recognition system based on Support Vector Machines. Zinnia simply receives user pen strokes as a sequence of coordinate data and outputs n-best characters sorted by SVM confidence. To keep portability, Zinnia doesn\\'t have any rendering functionality. In addition to recognition, Zinnia provides training module that allows us to create any hand-written recognition systems with low-cost."
LICENSE = "BSD-3-Clause"

PV = "0.07"

RPM_NAME = "zinnia-0.07-2.19.aarch64.rpm"
RPM_HASH = "81e954f214388d25722b34fbaae8c6987d04d5f40fb820e6495ebc4aa22e58537fafc532a448dcaa508d5c1ea8ffe612c8650fd6005536e37c2223d03020de11"

RPROVIDES:${PN} += "zinnia"

RDEPENDS:${PN} += "libc.so.6 \
libzinnia.so.0"

inherit rpm
