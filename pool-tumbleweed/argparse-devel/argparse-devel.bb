SUMMARY = "Header file for argparse, an argument parser for C++"
DESCRIPTION = "argparse is a header-only command-line argument parser for modern C++. \
 \
This package provides the header file for argparse."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "argparse-devel-3.2-1.6.aarch64.rpm"
RPM_HASH = "e4f7723c2aeda2be2854c7f7d950f82673d31dde80651e5dd8e14678dd565f07d315ad10b5ea26bafd96e23cdd8d62c3723ce12f222b68b134cc7dac71d44737"

RPROVIDES:${PN} += "argparse-devel \
cmake-argparse \
pkgconfig-argparse"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
