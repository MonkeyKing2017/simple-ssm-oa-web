<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="${baseResources}/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="${baseResources}/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="${baseResources}/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGIN STYLES -->
<link href="${baseResources}/plugins/gritter/css/jquery.gritter.css" rel="stylesheet" type="text/css"/>
<link href="${baseResources}/plugins/bootstrap-daterangepicker/daterangepicker-bs3.css" rel="stylesheet" type="text/css" />
<link href="${baseResources}/plugins/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" type="text/css"/>
<link href="${baseResources}/plugins/jqvmap/jqvmap/jqvmap.css" rel="stylesheet" type="text/css"/>
<link href="${baseResources}/plugins/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css"/>
<!-- END PAGE LEVEL PLUGIN STYLES -->
<!-- BEGIN THEME STYLES -->
<link href="${baseResources}/css/style-metronic.css" rel="stylesheet" type="text/css"/>
<link href="${baseResources}/css/style.css" rel="stylesheet" type="text/css"/>
<link href="${baseResources}/css/style-responsive.css" rel="stylesheet" type="text/css"/>
<link href="${baseResources}/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="${baseResources}/css/pages/tasks.css" rel="stylesheet" type="text/css"/>
<link href="${baseResources}/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
<link href="${baseResources}/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<!-- BEGIN DIY STYLES -->
<link href="${baseResources}/plugins/bootstrap-3.3.7-dist/css/bootstrap-table.min.css" rel="stylesheet" type="text/css">
<!-- END DIY STYLES -->


<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="${baseResources}/plugins/respond.min.js"></script>
<script src="${baseResources}/plugins/excanvas.min.js"></script>
<![endif]-->
<script src="${baseResources}/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<!-- IMPORTANT! Load jquery-ui-1.10.3.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
<script src="${baseResources}/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript" ></script>
<script src="${baseResources}/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/jquery.cookie.min.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/uniform/jquery.uniform.min.js" type="text/javascript" ></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="${baseResources}/plugins/jqvmap/jqvmap/jquery.vmap.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/jqvmap/jqvmap/maps/jquery.vmap.russia.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/jqvmap/jqvmap/maps/jquery.vmap.world.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/jqvmap/jqvmap/maps/jquery.vmap.europe.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/jqvmap/jqvmap/maps/jquery.vmap.germany.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/jqvmap/jqvmap/maps/jquery.vmap.usa.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/jqvmap/jqvmap/data/jquery.vmap.sampledata.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/flot/jquery.flot.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/flot/jquery.flot.resize.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/jquery.pulsate.min.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/bootstrap-daterangepicker/moment.min.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/bootstrap-daterangepicker/daterangepicker.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/gritter/js/jquery.gritter.js" type="text/javascript"></script>
<!-- IMPORTANT! fullcalendar depends on jquery-ui-1.10.3.custom.min.js for drag & drop support -->
<script src="${baseResources}/plugins/fullcalendar/fullcalendar/fullcalendar.min.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/jquery-easy-pie-chart/jquery.easy-pie-chart.js" type="text/javascript"></script>
<script src="${baseResources}/plugins/jquery.sparkline.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="${baseResources}/scripts/app.js" type="text/javascript"></script>
<script src="${baseResources}/scripts/index.js" type="text/javascript"></script>
<script src="${baseResources}/scripts/tasks.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
    jQuery(document).ready(function() {
        App.init(); // initlayout and core plugins
    });
</script>
<!-- END JAVASCRIPTS -->