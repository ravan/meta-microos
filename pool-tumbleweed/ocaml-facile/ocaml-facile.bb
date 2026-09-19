SUMMARY = "Ocaml Constraint Programming Library"
DESCRIPTION = "FaCiLe is a constraint programming library on integer and integer set \
finite domains written in OCaml. It offers all usual facilities to \
create and manipulate finite domain variables, arithmetic expressions \
and constraints (possibly non-linear), built-in global constraints \
(difference, cardinality, sorting etc.) and search and optimization \
goals. FaCiLe as well allows you to build easily user-defined \
constraints and goals (including recursive ones), making pervasive use \
of OCaml higher-order functionals to provide a simple and flexible \
interface for the user. As FaCiLe is an OCaml library and not 'yet \
another language', the user benefits from type inference and strong \
typing discipline, high level of abstraction, a modules and objects \
system, as well as native code compilation efficiency, garbage \
collection and replay debugger, all features of OCaml (among many \
others) that allow to prototype and experiment quickly: modeling, data \
processing and interface are implemented with the same powerful and \
efficient language."
LICENSE = "LGPL-2.1+"

PV = "1.1.4"

RPM_NAME = "ocaml-facile-1.1.4-3.1.aarch64.rpm"
RPM_HASH = "1a4b8f71e4098405b49c85bf2c2de72a719e2d82ad21bbcd5538bac376c0de45347b05a0f19180d09c964be5a6a368c9450b85b8a59251b39dfea3a20f838c5a"

RPROVIDES:${PN} += "ocaml-facile"

RDEPENDS:${PN} += ""

inherit rpm
