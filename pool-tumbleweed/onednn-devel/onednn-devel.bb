SUMMARY = "Header files of Intel Math Kernel Library"
DESCRIPTION = "Intel Math Kernel Library for Deep Neural Networks (Intel MKL-DNN) is an \
open-source performance library for deep-learning applications. The library \
accelerates deep-learning applications and frameworks on Intel architecture. \
Intel MKL-DNN contains vectorized and threaded building blocks that you can use \
to implement deep neural networks (DNN) with C and C++ interfaces. \
 \
This package includes the required headers and library files to develop software \
with the Intel MKL-DNN."
LICENSE = "Apache-2.0"

PV = "3.7.3"

RPM_NAME = "onednn-devel-3.7.3-2.1.aarch64.rpm"
RPM_HASH = "5120e8a5a72f1cbb359bf681d2d4bdae428a61d270209c7d987b18477e82f3a6fbc7416779a723685d0d416cd4887d2f9b9df4611b3768fc70282d90b39b3032"

RPROVIDES:${PN} += "cmake-dnnl \
mkl-dnn-devel \
oneDNN-devel \
onednn-devel"

RDEPENDS:${PN} += "libdnnl3"

inherit rpm
