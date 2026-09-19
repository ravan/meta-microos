SUMMARY = "Pager for JSON (or YAML) data"
DESCRIPTION = "JLess is a command-line JSON viewer designed for reading, exploring, and \
searching through JSON data. \
 \
JLess will pretty print your JSON and apply syntax highlighting. Use it when \
exploring external APIs, or debugging request payloads. \
 \
Expand and collapse Objects and Arrays to grasp the high- and low-level \
structure of a JSON document. JLess has a large suite of vim-inspired commands \
that make exploring data a breeze. \
 \
JLess supports full text regular-expression based search. Quickly find the data \
you're looking for in long String values, or jump between values for the same \
Object key."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "jless-0.9.0-1.14.aarch64.rpm"
RPM_HASH = "32a3d8f9d2f1848f9986fd1a26b5ace20b43c8e8180ee0089ec9a0ce28a1f88d4b0bba1baa832b7224f8e6fb1d09d37d974773de038afb31ee1205209b3e8504"

RPROVIDES:${PN} += "jless"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libxcb-render.so.0 \
libxcb-shape.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
