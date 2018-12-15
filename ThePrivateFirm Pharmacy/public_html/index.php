<?php
    session_start();
    if (isset($_SESSION['login'])){
        console.log(456);

    }else {
        header("Location:index1.php");
    }
?>

<!DOCTYPE html>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="assets/img/logo-fav.png">
    <title>The Private Firm Pharmacy</title>
    <link rel="stylesheet" type="text/css" href="assets/lib/perfect-scrollbar/css/perfect-scrollbar.min.css"/>
    <link rel="stylesheet" type="text/css" href="assets/lib/material-design-icons/css/material-design-iconic-font.min.css"/><!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="assets/lib/jquery.vectormap/jquery-jvectormap-1.2.2.css"/>
    <link rel="stylesheet" type="text/css" href="assets/lib/jqvmap/jqvmap.min.css"/>
    <link rel="stylesheet" type="text/css" href="assets/lib/datetimepicker/css/bootstrap-datetimepicker.min.css"/>
    <link rel="stylesheet" href="assets/css/style.css" type="text/css"/>
  </head>
  <body>
    <div class="be-wrapper be-fixed-sidebar">
      <nav class="navbar navbar-default navbar-fixed-top be-top-header">
        <div class="container-fluid">
          <div class="be-right-navbar">
            <ul class="nav navbar-nav navbar-right be-user-nav">
              <li class="dropdown"><a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="dropdown-toggle"><img src="assets/img/avatar.png" alt="Avatar"><span class="user-name">Túpac Amaru</span></a>
                <ul role="menu" class="dropdown-menu">
                  <li>
                    <div class="user-info">
                      <div class="user-name">Túpac Amaru</div>
                      <div class="user-position online">Available</div>
                    </div>
                  </li>
                  <li><a href="#"><span class="icon mdi mdi-face"></span> Account</a></li>
                  <li><a href="#"><span class="icon mdi mdi-settings"></span> Settings</a></li>
                  <li><a id="logout"><span class="icon mdi mdi-power"></span> Logout</a></li>
                </ul>
              </li>
            </ul>
            <div class="page-title"><span>PRIVATE PHARMACY </span></div>
            <ul class="nav navbar-nav navbar-right be-icons-nav">
              <li class="dropdown"><a href="#" role="button" aria-expanded="false" class="be-toggle-right-sidebar"><span class="icon mdi mdi-settings"></span></a></li>
              <li class="dropdown"><a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="dropdown-toggle"><span class="icon mdi mdi-notifications"></span><span class="indicator"></span></a>
                <ul class="dropdown-menu be-notifications">
                  <li>
                    <div class="title">Notifications<span class="badge">3</span></div>
                    <div class="list">
                      <div class="be-scroller">
                        <div class="content">
                          <ul>
                            <li class="notification notification-unread"><a href="#">
                                <div class="image"><img src="assets/img/avatar2.png" alt="Avatar"></div>
                                <div class="notification-info">
                                  <div class="text"><span class="user-name">Jessica Caruso</span> accepted your invitation to join the team.</div><span class="date">2 min ago</span>
                                </div></a></li>
                            <li class="notification"><a href="#">
                                <div class="image"><img src="assets/img/avatar3.png" alt="Avatar"></div>
                                <div class="notification-info">
                                  <div class="text"><span class="user-name">Joel King</span> is now following you</div><span class="date">2 days ago</span>
                                </div></a></li>
                            <li class="notification"><a href="#">
                                <div class="image"><img src="assets/img/avatar4.png" alt="Avatar"></div>
                                <div class="notification-info">
                                  <div class="text"><span class="user-name">John Doe</span> is watching your main repository</div><span class="date">2 days ago</span>
                                </div></a></li>
                            <li class="notification"><a href="#">
                                <div class="image"><img src="assets/img/avatar5.png" alt="Avatar"></div>
                                <div class="notification-info"><span class="text"><span class="user-name">Emily Carter</span> is now following you</span><span class="date">5 days ago</span></div></a></li>
                          </ul>
                        </div>
                      </div>
                    </div>
                    <div class="footer"> <a href="#">View all notifications</a></div>
                  </li>
                </ul>
              </li>
              <li class="dropdown"><a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="dropdown-toggle"><span class="icon mdi mdi-apps"></span></a>
                <ul class="dropdown-menu be-connections">
                  <li>
                    <div class="list">
                      <div class="content">
                        <div class="row">
                          <div class="col-xs-4"><a href="#" class="connection-item"><img src="assets/img/github.png" alt="Github"><span>GitHub</span></a></div>
                          <div class="col-xs-4"><a href="#" class="connection-item"><img src="assets/img/bitbucket.png" alt="Bitbucket"><span>Bitbucket</span></a></div>
                          <div class="col-xs-4"><a href="#" class="connection-item"><img src="assets/img/slack.png" alt="Slack"><span>Slack</span></a></div>
                        </div>
                        <div class="row">
                          <div class="col-xs-4"><a href="#" class="connection-item"><img src="assets/img/dribbble.png" alt="Dribbble"><span>Dribbble</span></a></div>
                          <div class="col-xs-4"><a href="#" class="connection-item"><img src="assets/img/mail_chimp.png" alt="Mail Chimp"><span>Mail Chimp</span></a></div>
                          <div class="col-xs-4"><a href="#" class="connection-item"><img src="assets/img/dropbox.png" alt="Dropbox"><span>Dropbox</span></a></div>
                        </div>
                      </div>
                    </div>
                    <div class="footer"> <a href="#">More</a></div>
                  </li>
                </ul>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <div class="be-left-sidebar">
        <div class="left-sidebar-wrapper"><a href="#" class="left-sidebar-toggle">Dashboard</a>
          <div class="left-sidebar-spacer">
            <div class="left-sidebar-scroll">
              <div class="left-sidebar-content">
                <ul class="sidebar-elements">
                  <li class="divider">Menu</li>
                  <li class="active"><a href="index.php"><i class="icon mdi mdi-home"></i><span>Home</span></a>
                  </li>
                  
                  <li><a href="pages-patient.html"><i class="icon mdi mdi-dot-circle"></i><span>Add Patient</span></a></li>
                  <li><a href="#"><i class="icon mdi mdi-border-all"></i><span>Registered Patients</span></a></li>
                  <li><a href="pages-consult.html"><i class="icon mdi mdi-layers"></i><span>Consultation</span></a></li>
                  <li class="divider">Communications</li>
                  <li class="parent"><a href="#"><i class="icon mdi mdi-inbox"></i><span>Messages</span></a>
                    <ul class="sub-menu">
                      <li><a href="email-inbox.html">Inbox</a>
                      </li>
                      <li><a href="email-compose.html">Message Compose</a>
                      </li>
                    </ul>
                  </li>
                  
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="be-content">
        <div class="main-content container-fluid">
          <div class="row">
            <div class="col-xs-12 col-md-6 col-lg-3">
                        <div class="widget widget-tile">
                          <div id="spark1" class="chart sparkline"></div>
                          <div class="data-info">
                            <div class="desc">New Users</div>
                            <div class="value"><span class="indicator indicator-equal mdi mdi-chevron-right"></span><span data-toggle="counter" data-end="113" class="number">0</span>
                            </div>
                          </div>
                        </div>
            </div>
            <div class="col-xs-12 col-md-6 col-lg-3">
                        <div class="widget widget-tile">
                          <div id="spark2" class="chart sparkline"></div>
                          <div class="data-info">
                            <div class="desc">Monthly Sales</div>
                            <div class="value"><span class="indicator indicator-positive mdi mdi-chevron-up"></span><span data-toggle="counter" data-end="80" data-suffix="%" class="number">0</span>
                            </div>
                          </div>
                        </div>
            </div>
            <div class="col-xs-12 col-md-6 col-lg-3">
                        <div class="widget widget-tile">
                          <div id="spark3" class="chart sparkline"></div>
                          <div class="data-info">
                            <div class="desc">Impressions</div>
                            <div class="value"><span class="indicator indicator-positive mdi mdi-chevron-up"></span><span data-toggle="counter" data-end="532" class="number">0</span>
                            </div>
                          </div>
                        </div>
            </div>
            <div class="col-xs-12 col-md-6 col-lg-3">
                        <div class="widget widget-tile">
                          <div id="spark4" class="chart sparkline"></div>
                          <div class="data-info">
                            <div class="desc">Downloads</div>
                            <div class="value"><span class="indicator indicator-negative mdi mdi-chevron-down"></span><span data-toggle="counter" data-end="113" class="number">0</span>
                            </div>
                          </div>
                        </div>
            </div>
          </div>
          <div class="row">
            <div class="col-md-12">
              <div class="widget widget-fullwidth be-loading">
                <div class="widget-head">
                  <div class="tools">
                    <div class="dropdown"><span data-toggle="dropdown" class="icon mdi mdi-more-vert visible-xs-inline-block dropdown-toggle"></span>
                      <ul role="menu" class="dropdown-menu">
                        <li><a href="#">Week</a></li>
                        <li><a href="#">Month</a></li>
                        <li><a href="#">Year</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Today</a></li>
                      </ul>
                    </div><span class="icon mdi mdi-chevron-down"></span><span class="icon toggle-loading mdi mdi-refresh-sync"></span><span class="icon mdi mdi-close"></span>
                  </div>
                  <div class="button-toolbar hidden-xs">
                    <div class="btn-group">
                      <button type="button" class="btn btn-default">Week</button>
                      <button type="button" class="btn btn-default active">Month</button>
                      <button type="button" class="btn btn-default">Year</button>
                    </div>
                    <div class="btn-group">
                      <button type="button" class="btn btn-default">Today</button>
                    </div>
                  </div><span class="title">Recent Movement</span>
                </div>
                <div class="widget-chart-container">
                  <div class="widget-chart-info">
                    <ul class="chart-legend-horizontal">
                      <li><span data-color="main-chart-color1"></span> Purchases</li>
                      <li><span data-color="main-chart-color2"></span> Plans</li>
                      <li><span data-color="main-chart-color3"></span> Services</li>
                    </ul>
                  </div>
                  <div class="widget-counter-group widget-counter-group-right">
                    <div class="counter counter-big">
                      <div class="value">25%</div>
                      <div class="desc">Purchase</div>
                    </div>
                    <div class="counter counter-big">
                      <div class="value">5%</div>
                      <div class="desc">Plans</div>
                    </div>
                    <div class="counter counter-big">
                      <div class="value">5%</div>
                      <div class="desc">Services</div>
                    </div>
                  </div>
                  <div id="main-chart" style="height: 260px;"></div>
                </div>
                <div class="be-spinner">
                  <svg width="40px" height="40px" viewBox="0 0 66 66" xmlns="http://www.w3.org/2000/svg">
                    <circle fill="none" stroke-width="4" stroke-linecap="round" cx="33" cy="33" r="30" class="circle"></circle>
                  </svg>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-md-6">
              <div class="panel panel-default panel-table">
                <div class="panel-heading"> 
                  <div class="tools"><span class="icon mdi mdi-download"></span><span class="icon mdi mdi-more-vert"></span></div>
                  <div class="title">Purchases</div>
                </div>
                <div class="panel-body table-responsive">
                  <table class="table table-striped table-borderless">
                    <thead>
                      <tr>
                        <th style="width:40%;">Product</th>
                        <th class="number">Price</th>
                        <th style="width:20%;">Date</th>
                        <th style="width:20%;">State</th>
                        <th style="width:5%;" class="actions"></th>
                      </tr>
                    </thead>
                    <tbody class="no-border-x">
                      <tr>
                        <td>Sony Xperia M4</td>
                        <td class="number">$149</td>
                        <td>Aug 23, 2016</td>
                        <td class="text-success">Completed</td>
                        <td class="actions"><a href="#" class="icon"><i class="mdi mdi-plus-circle-o"></i></a></td>
                      </tr>
                      <tr>
                        <td>Apple iPhone 6</td>
                        <td class="number">$535</td>
                        <td>Aug 20, 2016</td>
                        <td class="text-success">Completed</td>
                        <td class="actions"><a href="#" class="icon"><i class="mdi mdi-plus-circle-o"></i></a></td>
                      </tr>
                      <tr>
                        <td>Samsung Galaxy S7</td>
                        <td class="number">$583</td>
                        <td>Aug 18, 2016</td>
                        <td class="text-warning">Pending</td>
                        <td class="actions"><a href="#" class="icon"><i class="mdi mdi-plus-circle-o"></i></a></td>
                      </tr>
                      <tr>
                        <td>HTC One M9</td>
                        <td class="number">$350</td>
                        <td>Aug 15, 2016</td>
                        <td class="text-warning">Pending</td>
                        <td class="actions"><a href="#" class="icon"><i class="mdi mdi-plus-circle-o"></i></a></td>
                      </tr>
                      <tr>
                        <td>Sony Xperia Z5</td>
                        <td class="number">$495</td>
                        <td>Aug 13, 2016</td>
                        <td class="text-danger">Cancelled</td>
                        <td class="actions"><a href="#" class="icon"><i class="mdi mdi-plus-circle-o"></i></a></td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <div class="panel panel-default panel-table">
                <div class="panel-heading">
                  <div class="tools"><span class="icon mdi mdi-download"></span><span class="icon mdi mdi-more-vert"></span></div>
                  <div class="title">Latest Commits</div>
                </div>
                <div class="panel-body table-responsive">
                  <table class="table table-striped table-hover">
                    <thead>
                      <tr>
                        <th style="width:37%;">User</th>
                        <th style="width:36%;">Commit</th>
                        <th>Date</th>
                        <th class="actions"></th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td class="user-avatar"> <img src="assets/img/avatar6.png" alt="Avatar">Penelope Thornton</td>
                        <td>Topbar dropdown style</td>
                        <td>Aug 16, 2016</td>
                        <td class="actions"><a href="#" class="icon"><i class="mdi mdi-github-alt"></i></a></td>
                      </tr>
                      <tr>
                        <td class="user-avatar"> <img src="assets/img/avatar4.png" alt="Avatar">Benji Harper</td>
                        <td>Left sidebar adjusments</td>
                        <td>Jul 15, 2016</td>
                        <td class="actions"><a href="#" class="icon"><i class="mdi mdi-github-alt"></i></a></td>
                      </tr>
                      <tr>
                        <td class="user-avatar"> <img src="assets/img/avatar5.png" alt="Avatar">Justine Myranda</td>
                        <td>Main structure markup</td>
                        <td>Jul 28, 2016</td>
                        <td class="actions"><a href="#" class="icon"><i class="mdi mdi-github-alt"></i></a></td>
                      </tr>
                      <tr>
                        <td class="user-avatar"> <img src="assets/img/avatar3.png" alt="Avatar">Sherwood Clifford</td>
                        <td>Initial commit</td>
                        <td>Jun 30, 2016</td>
                        <td class="actions"><a href="#" class="icon"><i class="mdi mdi-github-alt"></i></a></td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-xs-12 col-md-4">
              <div class="panel panel-default">
                <div class="panel-heading panel-heading-divider xs-pb-15">Current Progress</div>
                <div class="panel-body xs-pt-25">
                  <div class="row user-progress user-progress-small">
                    <div class="col-md-5"><span class="title">Bootstrap Admin</span></div>
                    <div class="col-md-7">
                      <div class="progress">
                        <div style="width: 40%" class="progress-bar progress-bar-success"></div>
                      </div>
                    </div>
                  </div>
                  <div class="row user-progress user-progress-small">
                    <div class="col-md-5"><span class="title">Custom Work</span></div>
                    <div class="col-md-7">
                      <div class="progress">
                        <div style="width: 65%" class="progress-bar progress-bar-success"></div>
                      </div>
                    </div>
                  </div>
                  <div class="row user-progress user-progress-small">
                    <div class="col-md-5"><span class="title">Clients Module</span></div>
                    <div class="col-md-7">
                      <div class="progress">
                        <div style="width: 30%" class="progress-bar progress-bar-success"></div>
                      </div>
                    </div>
                  </div>
                  <div class="row user-progress user-progress-small">
                    <div class="col-md-5"><span class="title">Email Templates</span></div>
                    <div class="col-md-7">
                      <div class="progress">
                        <div style="width: 80%" class="progress-bar progress-bar-success"></div>
                      </div>
                    </div>
                  </div>
                  <div class="row user-progress user-progress-small">
                    <div class="col-md-5"><span class="title">Plans Module</span></div>
                    <div class="col-md-7">
                      <div class="progress">
                        <div style="width: 45%" class="progress-bar progress-bar-success"></div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-xs-12 col-md-4">
              <div class="widget be-loading">
                <div class="widget-head">
                  <div class="tools"><span class="icon mdi mdi-chevron-down"></span><span class="icon mdi mdi-refresh-sync toggle-loading"></span><span class="icon mdi mdi-close"></span></div>
                  <div class="title">Top Sales</div>
                </div>
                <div class="widget-chart-container">
                  <div id="top-sales" style="height: 178px;"></div>
                  <div class="chart-pie-counter">36</div>
                </div>
                <div class="chart-legend">
                  <table>
                    <tr>
                      <td class="chart-legend-color"><span data-color="top-sales-color1"></span></td>
                      <td>Premium Purchases</td>
                      <td class="chart-legend-value">125</td>
                    </tr>
                    <tr>
                      <td class="chart-legend-color"><span data-color="top-sales-color2"></span></td>
                      <td>Standard Plans</td>
                      <td class="chart-legend-value">1569</td>
                    </tr>
                    <tr>
                      <td class="chart-legend-color"><span data-color="top-sales-color3"></span></td>
                      <td>Services</td>
                      <td class="chart-legend-value">824</td>
                    </tr>
                  </table>
                </div>
                <div class="be-spinner">
                  <svg width="40px" height="40px" viewBox="0 0 66 66" xmlns="http://www.w3.org/2000/svg">
                    <circle fill="none" stroke-width="4" stroke-linecap="round" cx="33" cy="33" r="30" class="circle"></circle>
                  </svg>
                </div>
              </div>
            </div>
            <div class="col-xs-12 col-md-4">
              <div class="widget widget-calendar">
                <div id="calendar-widget"></div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-xs-12 col-md-6">
              <div class="panel panel-default">
                <div class="panel-heading">Latest Activity</div>
                <div class="panel-body">
                  <ul class="user-timeline user-timeline-compact">
                    <li class="latest">
                      <div class="user-timeline-date">Just Now</div>
                      <div class="user-timeline-title">Create New Page</div>
                      <div class="user-timeline-description">Vestibulum lectus nulla, maximus in eros non, tristique.</div>
                    </li>
                    <li>
                      <div class="user-timeline-date">Today - 15:35</div>
                      <div class="user-timeline-title">Back Up Theme</div>
                      <div class="user-timeline-description">Vestibulum lectus nulla, maximus in eros non, tristique.</div>
                    </li>
                    <li>
                      <div class="user-timeline-date">Yesterday - 10:41</div>
                      <div class="user-timeline-title">Changes In The Structure</div>
                      <div class="user-timeline-description">Vestibulum lectus nulla, maximus in eros non, tristique.      </div>
                    </li>
                    <li>
                      <div class="user-timeline-date">Yesterday - 3:02</div>
                      <div class="user-timeline-title">Fix the Sidebar</div>
                      <div class="user-timeline-description">Vestibulum lectus nulla, maximus in eros non, tristique.</div>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="col-xs-12 col-md-6">
              <div class="widget be-loading">
                <div class="widget-head">
                  <div class="tools"><span class="icon mdi mdi-chevron-down"></span><span class="icon mdi mdi-refresh-sync toggle-loading"></span><span class="icon mdi mdi-close"></span></div>
                  <div class="title">Conversions</div>
                </div>
                <div class="widget-chart-container">
                  <div class="widget-chart-info xs-mb-20">
                    <div class="indicator indicator-positive pull-right"><span class="icon mdi mdi-chevron-up"></span><span class="number">15%</span></div>
                    <div class="counter counter-inline">
                      <div class="value">156k</div>
                      <div class="desc">Impressions</div>
                    </div>
                  </div>
                  <div id="map-widget" style="height: 265px;"></div>
                </div>
                <div class="be-spinner">
                  <svg width="40px" height="40px" viewBox="0 0 66 66" xmlns="http://www.w3.org/2000/svg">
                    <circle fill="none" stroke-width="4" stroke-linecap="round" cx="33" cy="33" r="30" class="circle"></circle>
                  </svg>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <nav class="be-right-sidebar">
        <div class="sb-content">
          <div class="tab-navigation">
            <ul role="tablist" class="nav nav-tabs nav-justified">
              <li role="presentation" class="active"><a href="#tab1" aria-controls="tab1" role="tab" data-toggle="tab">Chat</a></li>
              <li role="presentation"><a href="#tab2" aria-controls="tab2" role="tab" data-toggle="tab">Todo</a></li>
              <li role="presentation"><a href="#tab3" aria-controls="tab3" role="tab" data-toggle="tab">Settings</a></li>
            </ul>
          </div>
          <div class="tab-panel">
            <div class="tab-content">
              <div id="tab1" role="tabpanel" class="tab-pane tab-chat active">
                <div class="chat-contacts">
                  <div class="chat-sections">
                    <div class="be-scroller">
                      <div class="content">
                        <h2>Recent</h2>
                        <div class="contact-list contact-list-recent">
                          <div class="user"><a href="#"><img src="assets/img/avatar1.png" alt="Avatar">
                              <div class="user-data"><span class="status away"></span><span class="name">Claire Sassu</span><span class="message">Can you share the...</span></div></a></div>
                          <div class="user"><a href="#"><img src="assets/img/avatar2.png" alt="Avatar">
                              <div class="user-data"><span class="status"></span><span class="name">Maggie jackson</span><span class="message">I confirmed the info.</span></div></a></div>
                          <div class="user"><a href="#"><img src="assets/img/avatar3.png" alt="Avatar">
                              <div class="user-data"><span class="status offline"></span><span class="name">Joel King		</span><span class="message">Ready for the meeti...</span></div></a></div>
                        </div>
                        <h2>Contacts</h2>
                        <div class="contact-list">
                          <div class="user"><a href="#"><img src="assets/img/avatar4.png" alt="Avatar">
                              <div class="user-data2"><span class="status"></span><span class="name">Mike Bolthort</span></div></a></div>
                          <div class="user"><a href="#"><img src="assets/img/avatar5.png" alt="Avatar">
                              <div class="user-data2"><span class="status"></span><span class="name">Maggie jackson</span></div></a></div>
                          <div class="user"><a href="#"><img src="assets/img/avatar6.png" alt="Avatar">
                              <div class="user-data2"><span class="status offline"></span><span class="name">Jhon Voltemar</span></div></a></div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="bottom-input">
                    <input type="text" placeholder="Search..." name="q"><span class="mdi mdi-search"></span>
                  </div>
                </div>
                <div class="chat-window">
                  <div class="title">
                    <div class="user"><img src="assets/img/avatar2.png" alt="Avatar">
                      <h2>Maggie jackson</h2><span>Active 1h ago</span>
                    </div><span class="icon return mdi mdi-chevron-left"></span>
                  </div>
                  <div class="chat-messages">
                    <div class="be-scroller">
                      <div class="content">
                        <ul>
                          <li class="friend">
                            <div class="msg">Hello</div>
                          </li>
                          <li class="self">
                            <div class="msg">Hi, how are you?</div>
                          </li>
                          <li class="friend">
                            <div class="msg">Good, I'll need support with my pc</div>
                          </li>
                          <li class="self">
                            <div class="msg">Sure, just tell me what is going on with your computer?</div>
                          </li>
                          <li class="friend">
                            <div class="msg">I don't know it just turns off suddenly</div>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                  <div class="chat-input">
                    <div class="input-wrapper"><span class="photo mdi mdi-camera"></span>
                      <input type="text" placeholder="Message..." name="q" autocomplete="off"><span class="send-msg mdi mdi-mail-send"></span>
                    </div>
                  </div>
                </div>
              </div>
              <div id="tab2" role="tabpanel" class="tab-pane tab-todo">
                <div class="todo-container">
                  <div class="todo-wrapper">
                    <div class="be-scroller">
                      <div class="todo-content"><span class="category-title">Today</span>
                        <ul class="todo-list">
                          <li>
                            <div class="be-checkbox be-checkbox-sm"><span class="delete mdi mdi-delete"></span>
                              <input id="todo1" type="checkbox" checked="">
                              <label for="todo1">Initialize the project</label>
                            </div>
                          </li>
                          <li>
                            <div class="be-checkbox be-checkbox-sm"><span class="delete mdi mdi-delete"></span>
                              <input id="todo2" type="checkbox">
                              <label for="todo2">Create the main structure</label>
                            </div>
                          </li>
                          <li>
                            <div class="be-checkbox be-checkbox-sm"><span class="delete mdi mdi-delete"></span>
                              <input id="todo3" type="checkbox">
                              <label for="todo3">Updates changes to GitHub</label>
                            </div>
                          </li>
                        </ul><span class="category-title">Tomorrow</span>
                        <ul class="todo-list">
                          <li>
                            <div class="be-checkbox be-checkbox-sm"><span class="delete mdi mdi-delete"></span>
                              <input id="todo4" type="checkbox">
                              <label for="todo4">Initialize the project</label>
                            </div>
                          </li>
                          <li>
                            <div class="be-checkbox be-checkbox-sm"><span class="delete mdi mdi-delete"></span>
                              <input id="todo5" type="checkbox">
                              <label for="todo5">Create the main structure</label>
                            </div>
                          </li>
                          <li>
                            <div class="be-checkbox be-checkbox-sm"><span class="delete mdi mdi-delete"></span>
                              <input id="todo6" type="checkbox">
                              <label for="todo6">Updates changes to GitHub</label>
                            </div>
                          </li>
                          <li>
                            <div class="be-checkbox be-checkbox-sm"><span class="delete mdi mdi-delete"></span>
                              <input id="todo7" type="checkbox">
                              <label for="todo7" title="This task is too long to be displayed in a normal space!">This task is too long to be displayed in a normal space!</label>
                            </div>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                  <div class="bottom-input">
                    <input type="text" placeholder="Create new task..." name="q"><span class="mdi mdi-plus"></span>
                  </div>
                </div>
              </div>
              <div id="tab3" role="tabpanel" class="tab-pane tab-settings">
                <div class="settings-wrapper">
                  <div class="be-scroller"><span class="category-title">General</span>
                    <ul class="settings-list">
                      <li>
                        <div class="switch-button switch-button-sm">
                          <input type="checkbox" checked="" name="st1" id="st1"><span>
                            <label for="st1"></label></span>
                        </div><span class="name">Available</span>
                      </li>
                      <li>
                        <div class="switch-button switch-button-sm">
                          <input type="checkbox" checked="" name="st2" id="st2"><span>
                            <label for="st2"></label></span>
                        </div><span class="name">Enable notifications</span>
                      </li>
                      <li>
                        <div class="switch-button switch-button-sm">
                          <input type="checkbox" checked="" name="st3" id="st3"><span>
                            <label for="st3"></label></span>
                        </div><span class="name">Login with Facebook</span>
                      </li>
                    </ul><span class="category-title">Notifications</span>
                    <ul class="settings-list">
                      <li>
                        <div class="switch-button switch-button-sm">
                          <input type="checkbox" name="st4" id="st4"><span>
                            <label for="st4"></label></span>
                        </div><span class="name">Email notifications</span>
                      </li>
                      <li>
                        <div class="switch-button switch-button-sm">
                          <input type="checkbox" checked="" name="st5" id="st5"><span>
                            <label for="st5"></label></span>
                        </div><span class="name">Project updates</span>
                      </li>
                      <li>
                        <div class="switch-button switch-button-sm">
                          <input type="checkbox" checked="" name="st6" id="st6"><span>
                            <label for="st6"></label></span>
                        </div><span class="name">New comments</span>
                      </li>
                      <li>
                        <div class="switch-button switch-button-sm">
                          <input type="checkbox" name="st7" id="st7"><span>
                            <label for="st7"></label></span>
                        </div><span class="name">Chat messages</span>
                      </li>
                    </ul><span class="category-title">Workflow</span>
                    <ul class="settings-list">
                      <li>
                        <div class="switch-button switch-button-sm">
                          <input type="checkbox" name="st8" id="st8"><span>
                            <label for="st8"></label></span>
                        </div><span class="name">Deploy on commit</span>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </nav>
    </div>
    <script src="assets/lib/jquery/jquery.min.js" type="text/javascript"></script>
    <script src="assets/lib/perfect-scrollbar/js/perfect-scrollbar.jquery.min.js" type="text/javascript"></script>
    <script src="assets/js/main.js" type="text/javascript"></script>
    <script src="assets/lib/bootstrap/dist/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="assets/lib/jquery-flot/jquery.flot.js" type="text/javascript"></script>
    <script src="assets/lib/jquery-flot/jquery.flot.pie.js" type="text/javascript"></script>
    <script src="assets/lib/jquery-flot/jquery.flot.resize.js" type="text/javascript"></script>
    <script src="assets/lib/jquery-flot/plugins/jquery.flot.orderBars.js" type="text/javascript"></script>
    <script src="assets/lib/jquery-flot/plugins/curvedLines.js" type="text/javascript"></script>
    <script src="assets/lib/jquery.sparkline/jquery.sparkline.min.js" type="text/javascript"></script>
    <script src="assets/lib/countup/countUp.min.js" type="text/javascript"></script>
    <script src="assets/lib/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
    <script src="assets/lib/jqvmap/jquery.vmap.min.js" type="text/javascript"></script>
    <script src="assets/lib/jqvmap/maps/jquery.vmap.world.js" type="text/javascript"></script>
    <script src="assets/js/login.js"></script>
    <script src="assets/js/app-dashboard.js" type="text/javascript"></script>
    <script type="text/javascript">
      $(document).ready(function(){
      	//initialize the javascript
      	$('#logout').click(function() {
      	    logout();
        });
      	App.init();
      	App.dashboard();
      
      });
    </script>
  </body>
</html>