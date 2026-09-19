SUMMARY = "Stream Analyzer"
DESCRIPTION = "Stan is a small console application that works on all UNIX systems. It \
is able to generate several types of statistical information about a \
stream. A stream can be either standard input or given files. For \
example, stan can be used to analyze encrypted data or to measure the \
quality of a pseudo-random number generator, but there are probably \
hundreds of other situations where stan comes in handy. \
 \
Stan supports three types of analysis: general statistics, pattern \
statistics, and bit statistics. By choosing intelligent values for each \
statistic, stan can give amazing results about a stream and is fun to \
work with."
LICENSE = "BSD-4-Clause"

PV = "0.4.1"

RPM_NAME = "stan-0.4.1-11.10.aarch64.rpm"
RPM_HASH = "f6f8ab8d14a1c8d5a6669061f7bae875c8800066d8c42c23a423d65136c3ad3af3cc5e4693e99edd10cc07e00b235d04d33a34305506529fe9ea9e31be825c98"

RPROVIDES:${PN} += "stan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
