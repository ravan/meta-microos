SUMMARY = "Headers and sources for OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides the headers and sources for developing applications with \
OpenVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "openvino-devel-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "21fe7fb831830840aed3e0b6c10233476c4e52296f7aa6e3078beb1751d18c07fb46c30b5a445de702c266f737fef3494c71d842210a84670a3418d1d7de0744"

RPROVIDES:${PN} += "cmake-OpenVINO \
openvino-devel \
pkgconfig-openvino"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenvino-c2631 \
libopenvino-ir-frontend2631 \
libopenvino-onnx-frontend2631 \
libopenvino-paddle-frontend2631 \
libopenvino-pytorch-frontend2631 \
libopenvino-tensorflow-frontend2631 \
libopenvino-tensorflow-lite-frontend2631 \
libopenvino2631 \
pkgconfig-OpenCL-Headers \
pkgconfig-flatbuffers \
pkgconfig-libva \
pkgconfig-nlohmann-json \
pkgconfig-ocl-icd \
pkgconfig-protobuf \
pkgconfig-pugixml \
pkgconfig-snappy \
pkgconfig-tbb"

inherit rpm
