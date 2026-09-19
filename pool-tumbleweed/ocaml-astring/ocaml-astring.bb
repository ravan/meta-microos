SUMMARY = "Alternative String module for OCaml"
DESCRIPTION = "Astring exposes an alternative String module for OCaml. This module tries to balance minimality and expressiveness for basic, index-free, string processing and provides types and functions for substrings, string sets and string maps. \
 \
Remaining compatible with the OCaml String module is a non-goal. The String module exposed by Astring has exception safe functions, removes deprecated and rarely used functions, alters some signatures and names, adds a few missing functions and fully exploits OCaml's newfound string immutability."
LICENSE = "ISC"

PV = "0.8.5"

RPM_NAME = "ocaml-astring-0.8.5-2.3.aarch64.rpm"
RPM_HASH = "3fc91e9fdf4860ba1471a893fc8802c411a7af075228335cdff27a6f2cfc9284418a456da0104c136c73d25ba8d5c7d0ae6e48d20d46be092784d9236915ec42"

RPROVIDES:${PN} += "ocaml-astring"

RDEPENDS:${PN} += ""

inherit rpm
